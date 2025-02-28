/*
 * This file is part of iZeMod - https://github.com/iZeMods/iZeMod
 * Copyright (C) 2014-2025 the original authors
 *                         - FlorianMichael/EnZaXD <florian.michael07@gmail.com>
 *                         - iZePlayzYT
 * Copyright (C) 2025 GitHub contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.izestudios.izemod.component.screen;

import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public final class ProfileScreen extends AbstractInitialScreen {

    public static final ProfileScreen INSTANCE = new ProfileScreen();

    public ProfileScreen() {
        super(Text.translatable("screens.profile"));
    }

    @Override
    protected void init() {
        final int baseY = (int) Math.sqrt(((double) (this.height * this.height) / (1.3 * 1.2)));

        this.addDrawableChild(ButtonWidget.builder(Text.translatable("screens.profile.password"), button -> {
        }).dimensions(this.width / 2 - 202, baseY + (25 * -5), 200, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.translatable("screens.profile.email"), button -> {
        }).dimensions(this.width / 2 - 202, baseY + (25 * -4), 200, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.translatable("screens.profile.transfer"), button -> {
        }).dimensions(this.width / 2 + 2, baseY + (25 * -5), 200, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.translatable("screens.profile.delete"), button -> {
        }).dimensions(this.width / 2 + 2, baseY + (25 * -4), 200, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.translatable("screens.profile.back"), button -> {
            this.client.setScreen(MainMenuScreen.INSTANCE);
        }).dimensions(this.width / 2 - 100, baseY + 10, 200, 20).build());
    }

}
