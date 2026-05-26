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
import static kss.base.Const.doubleQuotes;
import static kss.base.Const.lowerAlphabets;
import static kss.base.Const.numbers;
import static kss.base.Const.singleQuotes;
import static kss.base.Const.upperAlphabets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackupManager {

    private final Map<String, String> backupDict = new HashMap<>();

    public BackupManager() {
        for (String s : getData()) {
            this.backupDict.put(s, String.valueOf(Math.abs(s.hashCode())));
        }
    }

    public List<String> getData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String process(String text, Map<String, String> purposeDict) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addItem2Dict(String key, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String backup(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String restore(String text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
