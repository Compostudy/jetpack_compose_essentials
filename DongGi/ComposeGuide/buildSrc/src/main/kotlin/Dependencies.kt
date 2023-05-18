object KotlinDependencies {
 const val coroutines =
  "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutinesVersion}"
}

object AndroidXDependencies {
 const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
 const val lifeCycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
 const val activityCompose = "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
 const val composeUi = "androidx.compose.ui:ui:${Versions.composeUiVersion}"
 const val composeUiPreview ="androidx.compose.ui:ui-tooling-preview:${Versions.composeUiVersion}"
 const val composeMaterial ="androidx.compose.material:material:${Versions.composeMaterialDesignVersion}"
 const val jUnit = "androidx.test.ext:junit:${Versions.junit}"
 const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
 const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
 const val composeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.composeUiVersion}"
}


object TestDependencies {
 const val jUnit = "junit:junit:${Versions.junitVersion}"
 const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
 const val composeJUnit = "androidx.compose.ui:ui-test-junit4:${Versions.composeUiVersion}"
}

object DebugDependencies {
 const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeUiVersion}"
 const val composeUiTest = "androidx.compose.ui:ui-test-manifest:${Versions.composeUiVersion}"
}

object KaptDependencies {
 const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
 const val hiltAndroidCompiler =
  "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
}

object ThirdPartyDependencies {
 const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
 const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
 const val okHttpLog = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
 const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
 const val gsonConverter =
  "com.squareup.retrofit2:converter-gson:${Versions.gsonConverterVersion}"
 const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
 //TODO : Glide 추가할것
}