package tonius.zoom.client;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;
import tonius.zoom.Zoom;

public class KeyHandler {
    
    public static KeyBinding keyZoom;
    
    public static void init() {
        keyZoom = new KeyBinding(Zoom.PREFIX + "keybind.zoom", Keyboard.KEY_Z, "Zoom");
        ClientRegistry.registerKeyBinding(keyZoom);
    }
    
}
