package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    public void testWizardNameHealthSpells() {
        // 驗證一個新的巫師 instance 被成功建立。
        // 驗證標準：確保巫師的名字和生命值被正確地設定，並且他開始時沒有任咒語。
    }

    @Test
    public void testWizardLearnSpell() {
        // 驗證巫師能夠學習新咒語。
        // 驗證標準：確保咒語被正確地加入巫師的咒語集裡。
    }

    @Test
    public void testWizardCastSpell() {
        // 驗證一名巫師對另一名巫師施放咒語的功能。
        // 驗證標準：確保目標巫師的生命值正確地減少。
    }

    @Test
    public void testWizardHealthDecreaseAfterBeingHit() {
        // 驗證當巫師咒語擊中時，他的生命值應該減少。
        // 驗證標準：確保巫師的生命值正確地減少。
    }

    @Test
    public void testWizardDuelTournament() {
        // 驗證一場巫師之間的對決正確運作。
        // 驗證標準：確保每個巫師施放的咒語都正確地影響了對方的生命值。
    }
}