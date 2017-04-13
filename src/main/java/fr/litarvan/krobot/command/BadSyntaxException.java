/*
 * Copyright 2017 Adrien "Litarvan" Navratil
 *
 * This file is part of Krobot.
 *
 * Krobot is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Krobot is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Krobot.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.litarvan.krobot.command;

import fr.litarvan.krobot.ExceptionHandler;

/**
 * The Bad Syntax Exception<br><br>
 *
 *
 * An exception called when the syntax of the command
 * isn't respected.<br><br>
 *
 * Supposed to be caught by the {@link ExceptionHandler}<br>
 *
 * @author Litarvan
 * @version 2.1.0
 * @since 2.0.0
 */
public class BadSyntaxException extends Exception
{
    /**
     * The Bad Syntax Exception<br>
     * Default message is <i>"Bad command syntax"</i>
     */
    public BadSyntaxException()
    {
        super();
    }

    /**
     * The Bad Syntax Exception
     *
     * @param s The exception message
     */
    public BadSyntaxException(String s)
    {
        super(s);
    }
}
