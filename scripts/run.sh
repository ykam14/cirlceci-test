#!/bin/bash
cd scripts
gem install bundler
bundle install
cd ../../
ruby scripts/test.rb
