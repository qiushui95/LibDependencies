plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.google.accompanist:accompanist-adaptive:0.30.1")
    implementation("com.google.accompanist:accompanist-themeadapter-appcompat:0.30.1")
    implementation("com.google.accompanist:accompanist-drawablepainter:0.30.1")
    implementation("com.google.accompanist:accompanist-themeadapter-material3:0.30.1")
    implementation("com.google.accompanist:accompanist-themeadapter-material:0.30.1")
    implementation("com.google.accompanist:accompanist-navigation-animation:0.30.1")
    implementation("com.google.accompanist:accompanist-navigation-material:0.30.1")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.30.1")
    implementation("com.google.accompanist:accompanist-permissions:0.30.1")
    implementation("com.google.accompanist:accompanist-placeholder:0.30.1")
    implementation("com.google.accompanist:accompanist-placeholder-material:0.30.1")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.30.1")
    implementation("com.google.accompanist:accompanist-testharness:0.30.1")
    implementation("com.google.accompanist:accompanist-webview:0.30.1")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("com.github.fornewid:material-motion-compose:0.8.1")

    implementation("androidx.compose.animation:animation:1.4.0")
    implementation("androidx.compose.compiler:compiler:1.4.4")
    implementation("androidx.compose.foundation:foundation:1.4.0")
    implementation("androidx.compose.material:material:1.4.0")
    implementation("androidx.compose.ui:ui:1.4.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")



    implementation("androidx.activity:activity-compose:1.7.0")
    implementation("androidx.activity:activity-ktx:1.7.0")

    implementation("com.tencent.bugly:crashreport:4.1.9")
    implementation("com.tencent.bugly:crashreport_upgrade:1.6.1")

    implementation("androidx.camera:camera-camera2:1.2.2")
    implementation("androidx.camera:camera-core:1.2.2")
    implementation("androidx.camera:camera-extensions:1.2.2")
    implementation("androidx.camera:camera-lifecycle:1.2.2")
    implementation("androidx.camera:camera-video:1.2.2")
    implementation("androidx.camera:camera-view:1.2.2")

    debugImplementation("com.github.chuckerteam.chucker:library:3.5.2")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:3.5.2")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.core:core-splashscreen:1.0.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")

    implementation("com.github.yalantis:ucrop:2.2.8")
    implementation("com.github.yalantis:ucrop:2.2.8-native")

    kapt("me.laoyuyu.aria:compiler:3.8.16")
    implementation("me.laoyuyu.aria:core:3.8.16")
    implementation("me.laoyuyu.aria:ftp:3.8.16")
    implementation("me.laoyuyu.aria:m3u8:3.8.16")
    implementation("me.laoyuyu.aria:sftp:3.8.16")

    kapt("com.airbnb.android:epoxy-processor:5.1.2")
    implementation("com.airbnb.android:epoxy-compose:5.1.2")
    implementation("com.airbnb.android:epoxy:5.1.2")
    implementation("com.airbnb.android:epoxy-glide-preloading:5.1.2")

    implementation("androidx.tonyodev.fetch2:xfetch2:3.1.6")
    implementation("androidx.tonyodev.fetch2okhttp:xfetch2okhttp:3.1.6")

    implementation("io.github.reactivecircus.flowbinding:flowbinding-activity:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-android:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-appcompat:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-core:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-drawerlayout:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-lifecycle:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-material:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-navigation:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-preference:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-recyclerview:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-swiperefreshlayout:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-viewpager:1.2.0")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-viewpager2:1.2.0")

    implementation("androidx.fragment:fragment-ktx:1.5.6")
    testImplementation("androidx.fragment:fragment-testing:1.5.6")

    kapt("com.github.bumptech.glide:compiler:4.15.1")
    implementation("com.github.bumptech.glide:compose:1.0.0-alpha.2")
    implementation("com.github.bumptech.glide:glide:4.15.1")
    implementation("com.github.bumptech.glide:okhttp3-integration:4.15.1")

    implementation("io.github.lucksiege:camerax:v3.10.9")
    implementation("io.github.lucksiege:compress:v3.10.9")
    implementation("io.github.lucksiege:pictureselector:v3.10.9")
    implementation("io.github.lucksiege:ucrop:v3.10.9")

    implementation("com.geyifeng.immersionbar:immersionbar:3.2.2")
    implementation("com.geyifeng.immersionbar:immersionbar-ktx:3.2.2")

    implementation("io.insert-koin:koin-android:3.4.0")
    implementation("io.insert-koin:koin-androidx-compose:3.4.3")
    implementation("io.insert-koin:koin-core:3.4.0")
    implementation("io.insert-koin:koin-androidx-navigation:3.4.0")
    testImplementation("io.insert-koin:koin-test-junit5:3.4.0")
    implementation("io.insert-koin:koin-androidx-workmanager:3.4.0")

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.20")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.20")

    implementation("androidx.lifecycle:lifecycle-common:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-process:2.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.6.1")
    implementation("androidx.lifecycle:lifecycle-service:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

    implementation("com.airbnb.android:mavericks-compose:3.0.2")
    implementation("com.airbnb.android:mavericks:3.0.2")
    implementation("com.airbnb.android:mavericks-navigation:3.0.2")

    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")
    implementation("com.squareup.moshi:moshi:1.14.0")

    implementation("org.orbit-mvi:orbit-compose:4.6.1")
    implementation("org.orbit-mvi:orbit-core:4.6.1")
    testImplementation("org.orbit-mvi:orbit-test:4.6.1")
    implementation("org.orbit-mvi:orbit-viewmodel:4.6.1")

    implementation("androidx.navigation:navigation-compose:2.5.3")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    testImplementation("androidx.navigation:navigation-testing:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")

    implementation("com.liulishuo.okdownload:okdownload:1.0.7")
    implementation("com.liulishuo.okdownload:filedownloader:1.0.7")
    implementation("com.liulishuo.okdownload:ktx:1.0.7")
    implementation("com.liulishuo.okdownload:okhttp:1.0.7")
    implementation("com.liulishuo.okdownload:sqlite:1.0.7")

    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:4.10.0")

    kapt("com.airbnb.android:paris-processor:2.0.2")
    implementation("com.airbnb.android:paris:2.0.2")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")

    kapt("androidx.room:room-compiler:2.5.1")
    implementation("androidx.room:room-runtime:2.5.1")
    implementation("androidx.room:room-ktx:2.5.1")
    testImplementation("androidx.room:room-testing:2.5.1")

    implementation("androidx.sqlite:sqlite-framework:2.3.1")
    implementation("androidx.sqlite:sqlite-ktx:2.3.1")

    implementation("com.facebook.stetho:stetho:1.6.0")
    implementation("com.facebook.stetho:stetho-okhttp3:1.6.0")

    implementation("jp.wasabeef.transformers:coil:1.0.6")
    implementation("jp.wasabeef.transformers:coil-gpu:1.0.6")
    implementation("jp.wasabeef.transformers:core:1.0.6")
    implementation("jp.wasabeef.transformers:glide:1.0.6")
    implementation("jp.wasabeef.transformers:glide-gpu:1.0.6")

    implementation("net.gotev:uploadservice:4.7.0")
    implementation("net.gotev:uploadservice-ftp:4.7.0")
    implementation("net.gotev:uploadservice-okhttp:4.7.0")

    implementation("androidx.work:work-runtime-ktx:2.8.1")
    testImplementation("androidx.work:work-testing:2.8.1")



    implementation("com.aliyun.dpa:oss-android-sdk:2.9.13")
    implementation("com.aliyun.ams:alicloud-android-push:3.8.0")
    implementation("com.blankj:utilcodex:1.31.1")
    implementation("androidx.annotation:annotation:1.6.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.github.JavaNoober.BackgroundLibrary:libraryx:1.7.6")
    implementation("io.github.razerdp:BasePopup:3.2.1")
    implementation("me.jorgecastillo:androidcolorx:0.2.0")
    implementation("id.zelory:compressor:3.0.1")
    implementation("com.github.loperSeven:DateTimePicker:0.6.2")
    implementation("com.github.princekin-f:EasyFloat:2.0.4")
    implementation("androidx.exifinterface:exifinterface:1.3.6")
    implementation("io.github.hoc081098:FlowExt-jvm:0.6.0")
    implementation("com.github.seancfoley:ipaddress:5.4.0")
    implementation("joda-time:joda-time:2.12.5")
    implementation("com.squareup.leakcanary:leakcanary-android:2.10")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.25.1")
    implementation("com.tencent:mmkv-static:1.2.15")
    implementation("androidx.paging:paging-runtime-ktx:3.1.1")
    implementation("com.github.DSAppTeam:PanelSwitchHelper:v1.5.2")
    implementation("com.localebro:okhttpprofiler:1.0.8")
    implementation("com.github.jenly1314:zxing-lite:2.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
    implementation("com.github.liangjingkanji:soft-input-event:1.0.9")
    implementation("com.github.qiushui95:AndroidInitializer:1.0.16")
    implementation("com.dropbox.mobile.store:store4:4.0.5")
    implementation("com.tencent.vasdolly:helper:3.0.6")
    implementation("com.tencent.mm.opensdk:wechat-sdk-android-without-mta:6.8.0")
    implementation("com.iqiyi.xcrash:xcrash-android-lib:3.1.0")
    implementation("com.github.li-xiaojun:XPopup:2.9.19")
    implementation("com.github.getActivity:XXPermissions:16.8")
    implementation("net.lingala.zip4j:zip4j:2.11.5")



    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("androidx.test.ext:junit-ktx:1.1.5")



    implementation("com.github.Justson.AgentWeb:agentweb-core:v5.0.6-androidx")
    implementation("com.github.xiaohaibin:XBanner:androidx_v1.2.8")
    implementation("com.github.Dimezis:BlurView:version-2.0.3")
    implementation("com.ashokvarma.android:bottom-navigation-bar:2.2.0")
    implementation("me.majiajie:pager-bottom-tab-strip:2.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("io.github.csdn-mobile:RoundView:1.8.0")
    implementation("com.tbuonomo:dotsindicator:4.3")
    implementation("com.google.android.flexbox:flexbox:3.0.0")
    implementation("com.github.dkzwm:fet-core:0.2.1")

    implementation("com.airbnb.android:lottie-compose:6.0.0")
    implementation("com.airbnb.android:lottie:6.0.0")
    implementation("com.google.android.material:material:1.8.0")
    implementation("com.github.mhiew:android-pdf-viewer:3.2.0-beta.3")
    implementation("com.github.chrisbanes:PhotoView:2.3.0")
    implementation("io.github.chaosleung:pinview:1.4.4")
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("com.github.fondesa:recycler-view-divider:3.6.0")
    implementation("com.github.rubensousa:gravitysnaphelper:2.2.2")
    implementation("com.github.donkingliang:ConsecutiveScroller:4.6.4")

    implementation("io.github.scwang90:refresh-footer-classics:2.0.5")
    implementation("io.github.scwang90:refresh-header-classics:2.0.5")
    implementation("io.github.scwang90:refresh-layout-kernel:2.0.5")
    implementation("io.github.scwang90:refresh-header-two-level:2.0.5")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01")
    implementation("com.kyleduo.switchbutton:library:2.1.0")

    implementation("com.github.angcyo.DslTablayout:TabLayout:3.5.3")
    implementation("com.github.angcyo.DslTablayout:ViewPager1Delegate:3.5.3")
    implementation("com.github.angcyo.DslTablayout:ViewPager2Delegate:3.5.3")
    implementation("androidx.viewpager2:viewpager2:1.1.0-beta01")
}