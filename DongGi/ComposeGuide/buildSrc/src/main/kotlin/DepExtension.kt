import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandler.implementation(dependencyNotation: String): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.kapt(dependencyNotation: String): Dependency? =
    add("kapt", dependencyNotation)

fun DependencyHandler.testImplementation(dependencyNotation: String): Dependency? =
    add("testImplementation", dependencyNotation)

fun DependencyHandler.androidTestImplementation(dependencyNotation: String): Dependency? =
    add("androidTestImplementation", dependencyNotation)

fun DependencyHandler.kaptAndroidTest(dependencyNotation: String): Dependency? =
    add("kaptAndroidTest", dependencyNotation)

/**
 * 파라미터에 vararg 키워드를 붙이면 가변인자를 넘길 수 있다.
 * 가변인자를 사용하면 함수를 호출할 때 인자의 개수를 유동적으로 지정할 수 있다.
 * 만약 이미 존재하는 배열을 인자로 넘기는 경우에는 *을 앞에 붙여주면 된다.
 * val dependencies = arrayOf()
 * implementations(*dependencies)
 * 대신 만약 vararg 파라미터가 Generic 타입이 *을 생략해도 Array<out T> 타입은 인자로 받아들일 수 있다.
 */

fun DependencyHandlerScope.implementations(vararg argument: String) {
    argument.forEach { implementation(it) }
}

fun DependencyHandlerScope.addAndroidXDependencies() {
    implementations(
        AndroidXDependencies.coreKtx,
        AndroidXDependencies.appCompat,
        MaterialDesignDependencies.materialDesign,

        //TODO :  추후에 분리할것
        AndroidXDependencies.activityCompose,
        AndroidXDependencies.lifeCycleKtx,
        AndroidXDependencies.composeUi,
        AndroidXDependencies.composeUiPreview,
        AndroidXDependencies.composeMaterial,
        AndroidXDependencies.jUnit,
        AndroidXDependencies.viewModel,
        AndroidXDependencies.liveData,
        AndroidXDependencies.composeLiveData
    )
}

fun DependencyHandlerScope.addNetworkDependencies() {
    implementations(
        ThirdPartyDependencies.okHttp,
        ThirdPartyDependencies.okHttpLog,
        ThirdPartyDependencies.gsonConverter,
        ThirdPartyDependencies.gson,
        ThirdPartyDependencies.retrofit
    )
}

fun DependencyHandlerScope.addLifecycleDependencies() {
    implementations(
        AndroidXDependencies.lifeCycleKtx,
        AndroidXDependencies.viewModel,
        AndroidXDependencies.liveData
    )
}

fun DependencyHandler.addDaggerHiltDependencies() {
    implementation(ThirdPartyDependencies.hilt)
    kapt(KaptDependencies.hiltCompiler)
    kapt(KaptDependencies.hiltAndroidCompiler)
}

fun DependencyHandler.addTestDependencies() {
    testImplementation(TestDependencies.jUnit)
    androidTestImplementation(TestDependencies.espresso)
    implementation(TestDependencies.composeJUnit)
    implementation(TestDependencies.composeJUnit)
    implementation(DebugDependencies.composeUiTest)
    implementation(DebugDependencies.composeUiTooling)
}