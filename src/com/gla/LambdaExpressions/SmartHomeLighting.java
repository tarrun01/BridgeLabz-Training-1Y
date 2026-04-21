package com.gla.LambdaExpressions;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class SmartHomeLighting {

    public static void main(String[] args) {
        Consumer<String> motionTrigger  = room -> System.out.println("[Motion]  Turning on bright white light in: " + room);
        Consumer<String> morningTrigger = room -> System.out.println("[Morning] Setting warm sunrise light in: " + room);
        Consumer<String> eveningTrigger = room -> System.out.println("[Evening] Dimming to soft yellow light in: " + room);
        Consumer<String> nightTrigger   = room -> System.out.println("[Night]   Activating night lamp (10%) in: " + room);
        Consumer<String> voiceOnTrigger = room -> System.out.println("[Voice]   'Lights on' -> Full brightness in: " + room);
        Consumer<String> voiceOffTrigger = room -> System.out.println("[Voice]   'Lights off' -> Turning off lights in: " + room);
        Consumer<String> partyTrigger   = room -> System.out.println("[Party]   Enabling RGB color cycling in: " + room);

        Map<String, Consumer<String>> triggers = new HashMap<>();
        triggers.put("motion",   motionTrigger);
        triggers.put("morning",  morningTrigger);
        triggers.put("evening",  eveningTrigger);
        triggers.put("night",    nightTrigger);
        triggers.put("voice_on", voiceOnTrigger);
        triggers.put("voice_off",voiceOffTrigger);
        triggers.put("party",    partyTrigger);

        String[][] events = {
            {"motion",    "Living Room"},
            {"morning",   "Bedroom"},
            {"evening",   "Kitchen"},
            {"night",     "Hallway"},
            {"voice_on",  "Office"},
            {"voice_off", "Garage"},
            {"party",     "Living Room"}
        };

        System.out.println("=== Smart Home Lighting Events ===");
        for (String[] event : events) {
            String trigger = event[0];
            String room    = event[1];
            triggers.getOrDefault(trigger,
                r -> System.out.println("[Unknown] No behavior defined for: " + r)
            ).accept(room);
        }

        System.out.println("\n=== Chaining Behaviors: Evening + Motion ===");
        Consumer<String> eveningWithMotion = eveningTrigger.andThen(motionTrigger);
        eveningWithMotion.accept("Study Room");
    }
}
