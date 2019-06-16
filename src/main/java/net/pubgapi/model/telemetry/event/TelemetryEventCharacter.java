package net.pubgapi.model.telemetry.event;

import net.pubgapi.model.telemetry.object.Character;

/**
 * TelemetryEvent including a character
 */
public abstract class TelemetryEventCharacter extends TelemetryEvent {

    private Character character;

    public TelemetryEventCharacter() {
        super();
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}