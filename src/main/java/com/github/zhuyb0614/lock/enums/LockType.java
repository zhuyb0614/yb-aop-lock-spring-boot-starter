package com.github.zhuyb0614.lock.enums;

/**
 * @author yunbo.zhu
 * @version 1.0
 * @date 2022/7/9 2:40 δΈε
 */
public enum LockType {
    /**
     * Redis+Lua
     */
    REDIS,
    /**
     * Redission tryLockPerMills ζ ζ
     */
    REDISSON
}
