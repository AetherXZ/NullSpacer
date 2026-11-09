# Null Spacer

A minimal Android launcher activity with a fully transparent vector icon and an empty app label. Tapping it launches a no-display activity which immediately finishes. No permissions, network access, services, or data collection.

## Build

Open this folder in Android Studio (current stable, with Android SDK Platform 36 installed), allow Gradle sync, then choose **Build > Build Bundle(s) / APK(s) > Build APK(s)**.

The APK will be at `app/build/outputs/apk/debug/app-debug.apk`.

## Install and use

1. Install the APK and allow installation from the source you used, if Android asks.
2. Add **Null Spacer** from the app drawer to the home screen.
3. If the launcher shows a label, use its per-shortcut rename option and set the label to a single blank character if it permits; otherwise disable icon labels globally in launcher settings.

## Compatibility notes

Targets Android 16 / API 36 and supports Android 8.0+ (API 26). Whether a launcher preserves a completely transparent icon, keeps a blank label, or substitutes a fallback glyph is launcher-specific. Funtouch OS may impose its own icon rendering. This app cannot force the launcher to reserve a slot if the launcher rejects transparent icons.
