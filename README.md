# NullSpacer

**Presence without appearance.**

NullSpacer is a minimal Android utility that creates an invisible, unlabeled home-screen shortcut.

Tapping the shortcut launches a no-display activity, which immediately finishes.

## Features

- Completely transparent launcher icon.
- Empty application label.
- No-display activity that immediately finishes.
- No Android permissions declared.
- No advertising, analytics, or tracking functionality.

## Compatibility

| Requirement | Version |
|---|---|
| Minimum Android version | Android 8.0 (API 26) |
| Compile SDK | Android 16 (API 36) |
| Target SDK | Android 16 (API 36) |
| Tested device | iQOO 12 — Android 16 |

**Launcher compatibility:** Transparent icons and empty labels depend on the launcher. Some launchers may substitute a fallback icon, display a label, or refuse to reserve a home-screen position.

## Installation

1. Download the APK from [GitHub Releases](https://github.com/AetherXZ/NullSpacer/releases).
2. Install the APK.
3. Open your app drawer.
4. Add NullSpacer to your home screen.

Your launcher may require additional configuration to preserve the empty label or transparent appearance.

## Building from source

### Requirements

- Android SDK Platform 36
- JDK 17
- Gradle 8.13

### Build

```bash
gradle assembleDebug
```

The generated APK will be available at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

Alternatively, open the project in Android Studio, allow Gradle synchronisation, and build the debug APK.

## Privacy

See [PRIVACY.md](PRIVACY.md).

## License

This project is distributed under the **GNU General Public License v3.0**.

See [LICENSE](LICENSE) for the complete licence text.

---

*NullSpacer — a shortcut that leaves nothing behind.*
