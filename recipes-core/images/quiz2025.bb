require recipes-platform/images/agl-image-flutter.bb

IMAGE_INSTALL:remove = " flutter-samples-material-3-demo"
IMAGE_INSTALL:append = " agl-gsoc-flutter-app"