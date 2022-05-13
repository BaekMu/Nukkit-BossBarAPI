# Nukkit(CloudBusrt) BossBarAPI
Very simple BossBarAPI
## Usage
```Java
import BaekMu.Nukkit.BossBarAPI.BossBarAPI
```
```Java
void example1(Player player) {   
  BossBarAPI bba = new BossBarAPI(player, "text", 100.f, BossBarColor.RED);
  bba.Draw();
}
```
```Java
void example2(Player player) {  
  BossBarAPI bba = new BossBarAPI(player);  
  
  /* hard way */  
  bba.SetText("text");  
  bba.SetLength(100.f);  
  bba.SetColor(BossBarColor.RED);  
  
  /* simple way */  
  bba.Update("text", 100.f, BossBarColor.RED);  
  
  bba.Draw(); // draw bossbar  
}
```

## Method
```Java
Draw(); // Draw BossBar
Destroy(); // Destroy BossBar, You can redraw with 'Draw()'

SetText(String text); // Change BossBar's Text
SetLength(Float length); // Change BossBar's Length
SetColor(BossBarColor color); // Change BossBar's Color
Update(String text, Float length, BossBarColor color); // Same as 'Set' Method above

GetBossBarID(); // return BossBarID
GetDummyBossBar(); // return DummyBossBar
```

## Dependency
```
<dependency>
    <groupId>BaekMu.Nukkit</groupId>
    <artifactId>BossBarAPI</artifactId>
    <version>1.0.0</version>
    <scope>provided<scope>
</dependency>
```