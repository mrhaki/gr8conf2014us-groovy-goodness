#!/usr/bin/env groovy
/*
//def gitCommand = 'git log --max-count=1 --pretty="format:%an commited %s [%h]"'

def gitCommand = [
	'git', 'log', '--maxcount=1',
	'--pretty="format:%an commited %s [%h]"'
]
def gitLog = gitCommand.execute()

def logText = gitLog.text


def notifyCommand = ['terminal-notifier', '-title=GIT', 
"-message=test"]

def notify = notifyCommand.execute()
*/

//#!/usr/bin/env groovy

// Arguments for git log command.
def logArgs = ['max-count': '1', 'pretty': 'format:%an commited %s {%h}']

// Invoke git log command.
def gitLog = logArgs.inject(['git', 'log']) { cmd, k, v -> 
    cmd << "--$k=$v" 
}.execute()
gitLog.waitFor()

// Get git log message to be used as notification message.
def message = gitLog.text

// Set icon and title for message.
def title = 'Git commit'

// Notify user of commit with growlnotify.
def notifyArgs = [message: message, title: title]
notifyArgs.inject(['terminal-notifier']) { cmd, k, v ->
    cmd << "-$k" << v
}.execute()