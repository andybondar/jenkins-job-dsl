job ('DSL-Tutorial-1') {
        steps {
                shell ('echo $BUILD_TAG; echo $WORKSPACE')
        }
}
