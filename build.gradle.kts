apply {
    from("$rootDir/${Android.androidLibrary}")
}

dependencies {
    "implementation"(Compose.ui)
    "implementation"(Compose.material)
    "implementation"(Compose.runtime)
}