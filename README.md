# **FrameFlow – Dynamic Performance Booster**

*Real-time FPS stabilization, memory fixes & automatic optimization for Minecraft.*

---

## ⭐ **Overview**

Minecraft is famous for being “badly optimized,” causing FPS drops, chunk-loading lag, stutters, and even GPU memory crashes.  
**FrameFlow** solves this by dynamically tuning the game *as you play*.

It continuously monitors FPS, CPU load, and memory usage, then **automatically adjusts graphics, chunk loading, and resource usage** to keep gameplay smooth.

No setup required. No complicated menus.  
Install → Play → Enjoy stable FPS.

---

## 🚀 **Key Features**

### 🎚 **Adaptive Performance Engine**
A smart controller that monitors your FPS in real-time and automatically adjusts:
- Render distance
- Particle density
- Entity detail
- Animation speeds
- Chunk update priority

When FPS drops, FrameFlow gently reduces load.  
When performance improves, settings rise back up.

### 🧠 **Memory & VRAM Optimization**
Built-in fixes and safety improvements:
- Reduces memory spikes
- Flushes unused textures & caches
- Prevents common GPU memory leak patterns
- Optional safe memory cleanup on demand

Designed for smoother long sessions without stutters.

### 💤 **Idle & Dimension Change Optimizer**
When the player is AFK or switching dimensions, FrameFlow:
- Unloads far chunks
- Releases stale entities
- Cleans renderer caches
- Frees unused memory

This prevents buildup that normally causes lag *after* long play sessions.

### ⚡ **One-Click “Optimize Now” Button**
Available in the **Options menu + Pause menu**:
- Clears caches
- Frees memory
- Resets heavy renderer states
- Runs a safe cleanup pass

You instantly feel the difference after long gameplay.

### 🔧 **Compatibility Layer**
Works alongside:
- **Sodium**
- **Indium**
- **Iris**
- **Lithium**
- Other performance mods

FrameFlow only adjusts systems **not already controlled** by those mods.

---

## 📦 **Installation**

1. Install **Fabric Loader** for your Minecraft version.
2. Install **Fabric API**.
3. Download the latest **FrameFlow-x.x.x.jar** from Releases or Modrinth.
4. Place the `.jar` in your `.minecraft/mods/` folder.
5. Launch the game. You're done!

---

## 🔍 **How It Works (Technical Summary)**

FrameFlow runs a lightweight performance loop every few ticks:

- Samples **FPS**, **frame time**, **heap usage**, **native memory**, and **entity density**
- Compares performance against your configured target FPS
- Chooses the lowest-impact action from a tiered system:
  - *Gentle*: particle throttling, animation slowdown
  - *Moderate*: entity render distance reduction, LOD step-down
  - *Aggressive*: render distance drop, chunk update throttling
- Applies cool-down timers so settings don’t “bounce”
- Reverts changes when performance stabilizes

All logic runs client-side and uses Fabric-safe hooks + mixins.

---

## 🛠 **Configuration**

Customizable through the in-game settings menu:
- Target FPS
- Action intensity
- Idle detection timeout
- VRAM/memory cleanup modes
- Compatibility rules
- HUD overlay toggle

Advanced users can edit the config JSON manually.

---

## 🧪 **Benchmarking**

FrameFlow includes optional logging tools for:
- Average FPS
- Minimum FPS
- Frame pacing variance
- Memory usage over time

Useful for modpack creators or players measuring performance gain.

---

## 💬 **FAQ**

**Q: Will this conflict with Sodium or OptiFine?**  
A: No. FrameFlow detects major performance mods and avoids overlapping settings.

**Q: Does this affect gameplay?**  
A: Only visuals and client rendering, not world logic or server behavior.

**Q: Does it run on servers?**  
A: No — this is **client-side only**, but fully compatible with any server.

---

## 🧩 **Planned Features**
- Shader-quality auto-tuning
- Machine-learning FPS prediction model
- Server-friendly optimization telemetry
- Modpack auto-profiles

---

## 🤝 **Contributing**

We welcome:
- Pull requests
- Performance tweaks
- Compatibility modules
- Translations

Please read `CONTRIBUTING.md` before contributing.

---

## 📄 **License**

This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute it.

---
