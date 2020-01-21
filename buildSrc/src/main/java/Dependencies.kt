object Dependencies {
    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    }

    object AndroidX {
        private const val version = "1.1.0"
        const val appcompat = "androidx.appcompat:appcompat:$version"
        const val ktx = "androidx.core:core-ktx:$version"
        const val recyclerview = "androidx.recyclerview:recyclerview:$version"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val material = "com.google.android.material:material:1.0.0"

        object Test {
            const val junit = "androidx.test.ext:junit:1.1.1"
            const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }

    object Timber {
        const val common = "com.jakewharton.timber:timber:4.7.1"
    }

    object Test {
        const val junit = "junit:junit:4.12"
    }
}