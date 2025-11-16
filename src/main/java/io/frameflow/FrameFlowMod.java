package io.frameflow;

import net.fabricmc.api.ClientModInitializer;

public class FrameFlowMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Entry point for FrameFlow mod
        System.out.println("FrameFlow mod initialized!");
        // Initialize core, adaptive manager, actuators, etc. in future commits.
    }
}