setup:
	cd code/app && ./gradlew clean install
run-dist:
	./build/install/app/bin/app
build:
	./gradlew clean
	./gradlew installDist

.PHONY: build
