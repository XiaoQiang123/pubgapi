/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pubgapi.model.tournament;

import java.time.ZonedDateTime;

/**
 *
 * @author GPL_NATURE <GGWP PLAY LEAGUE>
 */
public class TournamentAttributes {
    
    private ZonedDateTime createdAt;

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }
}