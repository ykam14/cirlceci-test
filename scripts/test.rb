require 'slack-notifier'

# SlackのWebhook URL
slack_webhook_url = ENV['TEST']
notifier = Slack::Notifier.new slack_webhook_url
notifier.ping '@aws-devicefarm : :eyes: ' + env['CIRCLE_TAG']
