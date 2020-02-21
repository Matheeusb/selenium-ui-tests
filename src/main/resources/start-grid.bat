cmd /C start/MIN docker pull elgalu/selenium
docker run --rm --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /temp/videos:/home/seluser/videos --privileged dosel/zalenium start --timeZone "America/Sao_Paulo" --screenWidth 1280 --screenHeight 800 --desiredContainers 4 --maxDockerSeleniumContainers 10 --maxTestSessions 1