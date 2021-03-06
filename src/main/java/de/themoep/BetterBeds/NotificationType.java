package de.themoep.BetterBeds;

/*
 * BetterBeds
 * Copyright (c) 2019 Max Lee aka Phoenix616 (mail@moep.tv)
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

/**
 * Enum to specify who should get a notification message.
 * NOONE - Don't display the message to anyone
 * SLEEPING - Only players who lye in a bed
 * WORLD - Every player who is in the same world
 * SERVER - Every player on the server
 */
public enum NotificationType {
        NOONE,
        SLEEPING,
        WORLD,
        SERVER;
}
