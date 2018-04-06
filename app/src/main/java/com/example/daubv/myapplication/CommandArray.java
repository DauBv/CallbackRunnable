package com.example.daubv.myapplication;

import android.util.SparseArray;

/**
 * コマンド管理クラス
 */
public class CommandArray {
    /**
     * コマンドリスト
     */
    private final SparseArray<Runnable> commands = new SparseArray<Runnable>();

    /**
     * コマンドの登録
     * @param key
     * @param runnable
     */
    public void put(int key, Runnable runnable) {
        commands.put(key, runnable);
    }

    /**
     * コマンドの取得
     * @param key
     * @return
     */
    public Runnable get(int key) {
        return commands.get(key);
    }
}
