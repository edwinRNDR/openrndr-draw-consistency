plugins {
    kotlin("jvm")
}

dependencies {
    runtimeOnly(libs.bundles.lwjgl.full) {
        artifact {
            classifier = "natives-linux-arm64"
            extension = DependencyArtifact.DEFAULT_TYPE
        }
    }
}
