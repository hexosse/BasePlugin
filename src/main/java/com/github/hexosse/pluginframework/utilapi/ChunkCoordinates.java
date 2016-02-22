package com.github.hexosse.pluginframework.utilapi;

/*
 * Copyright 2016 hexosse
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/**
 * This file is part HexocubeItems
 *
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */
public class ChunkCoordinates implements Comparable {

    public int x;
    public int y;
    public int z;

    public ChunkCoordinates() {
    }

    public ChunkCoordinates(int paramInt1, int paramInt2, int paramInt3) {
        this.x = paramInt1;
        this.y = paramInt2;
        this.z = paramInt3;
    }

    public ChunkCoordinates(ChunkCoordinates paramChunkCoordinates) {
        this.x = paramChunkCoordinates.x;
        this.y = paramChunkCoordinates.y;
        this.z = paramChunkCoordinates.z;
    }

    public boolean equals(Object paramObject) {
        if (!(paramObject instanceof ChunkCoordinates)) {
            return false;
        }

        ChunkCoordinates localChunkCoordinates = (ChunkCoordinates) paramObject;
        return (this.x == localChunkCoordinates.x) && (this.y == localChunkCoordinates.y) && (this.z == localChunkCoordinates.z);
    }

    public int hashCode() {
        return this.x + this.z << 8 + this.y << 16;
    }

    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof ChunkCoordinates)) {
            return -10000;
        }
        ChunkCoordinates paramChunkCoordinates = (ChunkCoordinates) obj;
        if (this.y == paramChunkCoordinates.y) {
            if (this.z == paramChunkCoordinates.z) {
                return this.x - paramChunkCoordinates.x;
            }
            return this.z - paramChunkCoordinates.z;
        }
        return this.y - paramChunkCoordinates.y;
    }

    public void b(int paramInt1, int paramInt2, int paramInt3) {
        this.x = paramInt1;
        this.y = paramInt2;
        this.z = paramInt3;
    }

    public float e(int paramInt1, int paramInt2, int paramInt3) {
        float f1 = this.x - paramInt1;
        float f2 = this.y - paramInt2;
        float f3 = this.z - paramInt3;
        return f1 * f1 + f2 * f2 + f3 * f3;
    }

    public float e(ChunkCoordinates paramChunkCoordinates) {
        return e(paramChunkCoordinates.x, paramChunkCoordinates.y, paramChunkCoordinates.z);
    }

    public String toString() {
        return "Pos{x=" + this.x + ", y=" + this.y + ", z=" + this.z + '}';
    }

}

