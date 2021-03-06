/*
 * Copyright (C) 2020 pierpaolo
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
package di.uniba.map.b.lab.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pierpaolo
 */
public class EsempioQueue1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("g");
        q.offer("h");
        q.offer("a");
        System.out.println(q.poll()); //g
        System.out.println(q.peek()); //h
    }

}
