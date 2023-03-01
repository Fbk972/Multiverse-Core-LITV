package com.onarandombox.MultiverseCore.utils;

import co.aikar.locales.MessageKey;
import co.aikar.locales.MessageKeyProvider;

public enum MVCorei18n implements MessageKeyProvider {
    CONFIG_SAVE_FAILED,

    // check command
    CHECK_CHECKING,

    // clone command
    CLONE_CLONING,
    CLONE_FAILED,
    CLONE_SUCCESS,
    CREATE_PROPERTIES,
    CREATE_PROPERTIES_ENVIRONMENT,
    CREATE_PROPERTIES_SEED,
    CREATE_PROPERTIES_WORLDTYPE,
    CREATE_PROPERTIES_ADJUSTSPAWN,
    CREATE_PROPERTIES_GENERATOR,
    CREATE_PROPERTIES_STRUCTURES,
    CREATE_LOADING,
    CREATE_FAILED,
    CREATE_SUCCESS,

    // delete command
    DELETE_DELETING,
    DELETE_FAILED,
    DELETE_SUCCESS,
    DELETE_PROMPT,
    DEBUG_INFO_OFF,
    DEBUG_INFO_ON;

    private final MessageKey key = MessageKey.of("mv-core." + this.name().replace('_', '.').toLowerCase());

    @Override
    public MessageKey getMessageKey() {
        return this.key;
    }
}
