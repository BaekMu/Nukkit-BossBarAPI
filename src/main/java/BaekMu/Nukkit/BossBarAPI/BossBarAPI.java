package BaekMu.Nukkit.BossBarAPI;

import cn.nukkit.Player;
import cn.nukkit.utils.BossBarColor;
import cn.nukkit.utils.DummyBossBar;

public class BossBarAPI {
    private final Player player;
    private final long bossBarID;
    private final DummyBossBar dummyBossBar;

    public BossBarAPI(Player player, String text, Float length, BossBarColor color) {
        this.player = player;
        this.dummyBossBar = new DummyBossBar.Builder(player).build();
        this.bossBarID = this.dummyBossBar.getBossBarId();

        this.Update(text, length, color);
    }

    public BossBarAPI(Player player) {
        this.player = player;
        this.dummyBossBar = new DummyBossBar.Builder(player).build();
        this.bossBarID = this.dummyBossBar.getBossBarId();
    }

    public void Draw() {
        player.createBossBar(this.dummyBossBar);
    }

    public void Destroy() { player.removeBossBar(this.bossBarID); }

    public void SetText(String text) {
        this.dummyBossBar.setText(text);
    }

    public void SetLength(Float length) {
        this.dummyBossBar.setLength(length);
    }

    public void SetColor(BossBarColor color) {
        this.dummyBossBar.setColor(color);
    }

    public void Update(String text, Float length, BossBarColor color) {
        this.SetText(text);
        this.SetLength(length);
        this.SetColor(color);
    }

    public Long GetBossBarID() {
        return this.bossBarID;
    }

    public DummyBossBar GetDummyBossBar() {
        return this.dummyBossBar;
    }
}
