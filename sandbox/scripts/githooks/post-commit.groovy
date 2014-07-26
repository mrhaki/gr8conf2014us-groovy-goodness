#!/usr/bin/env groovy

// Invoke git log command.
def gitLog = [
	'git', 'log',
	'--max-count=1',
	'--pretty=format:%an commited %s [%h]'
].execute()

// Get git log message to be used as notification message.
def message = gitLog.text

['terminal-notifier', '-title', 'Git Commit', '-message', message].execute()