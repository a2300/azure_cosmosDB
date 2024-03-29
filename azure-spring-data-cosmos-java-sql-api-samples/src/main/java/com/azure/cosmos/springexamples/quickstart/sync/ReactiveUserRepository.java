// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.springexamples.quickstart.sync;

import com.azure.cosmos.springexamples.common.User;
import com.azure.spring.data.cosmos.repository.Query;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ReactiveUserRepository extends ReactiveCosmosRepository<User, String> {

    @Query(value = "SELECT * FROM users u WHERE u.firstName = @firstName")
    Flux<User> findByFirstName(String firstName);
}

