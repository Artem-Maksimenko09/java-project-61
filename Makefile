run-dist:
	./build/install/app/bin/app

build:
	./gradlew installDist

setup:
	./gradlew clean install

.PHONY: build setup
