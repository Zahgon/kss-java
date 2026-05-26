package kss.base;

/*
 * Korean Sentence Splitter
 * Split Korean text into sentences using heuristic algorithm.
 *
 * Copyright (C) 2021 Sang-ji Lee <tkdwl06@gmail.com>
 * Copyright (C) 2021 Hyun-woong Ko <kevin.woong@tunib.ai> and Sang-Kil Park <skpark1224@hyundai.com>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
public class SentenceIndex {

    private int start;

    private int end;

    public SentenceIndex(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setStart(int start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getEnd() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setEnd(int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
