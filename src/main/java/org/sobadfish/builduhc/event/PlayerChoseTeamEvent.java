package org.sobadfish.builduhc.event;

import cn.nukkit.event.Cancellable;
import cn.nukkit.plugin.Plugin;
import org.sobadfish.builduhc.player.PlayerInfo;
import org.sobadfish.builduhc.player.team.TeamInfo;
import org.sobadfish.builduhc.room.GameRoom;


/**
 * 玩家选择队伍事件
 * @author SoBadFish
 * 2022/1/15
 */
public class PlayerChoseTeamEvent extends PlayerRoomInfoEvent implements Cancellable {


    private final TeamInfo teamInfo;

    public PlayerChoseTeamEvent(PlayerInfo playerInfo, TeamInfo teamInfo, GameRoom room, Plugin plugin) {
        super(playerInfo,room, plugin);
        this.teamInfo = teamInfo;
    }



    public TeamInfo getTeamInfo() {
        return teamInfo;
    }
}
