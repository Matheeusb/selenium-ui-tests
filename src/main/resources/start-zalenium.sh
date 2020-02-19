#!/bin/bash

docker pull elgalu/zalenium

docker run --rm -ti --name teste -p 4444:4444 \
  -e DOCKER=17.06.2-ce \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v /tmp/videos:/home/seluser/videos \
  --privileged dosel/zalenium start --timeZone "America/Sao_Paulo" \
  --screenWidth 1280 --screenHeight 800 \
  --desiredContainers 4 --maxDockerSeleniumContainers 10 --maxTestSessions 1 \
  --videoRecordingEnabled false