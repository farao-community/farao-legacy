/*
 * Copyright (c) 2018, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.farao_community.farao.data.crac_file.xlsx.converter;

import com.farao_community.farao.data.crac_file.xlsx.model.Activation;
import com.farao_community.farao.commons.FaraoException;
import lombok.extern.slf4j.Slf4j;

/**
 * Activation Converter class
 *
 * @author Marc Erkol {@literal <marc.erkol at rte-france.com>}
 */
@Slf4j
public final class ActivationConverter implements Converter<Activation> {
    @Override
    public Activation convert(String value, int row) {
        try {
            return Activation.valueOf(value.toUpperCase());
        } catch (Exception e) {
            log.error(String.format("Failed to parse '%s' at row='%s' ", value, row));
            throw new FaraoException(String.format("Failed to parse '%s' at row='%s' ", value, row), e);
        }
    }
}
