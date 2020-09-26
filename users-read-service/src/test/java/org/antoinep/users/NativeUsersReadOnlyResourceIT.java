package org.antoinep.users;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeUsersReadOnlyResourceIT extends UsersReadOnlyResourceTest {

    // Execute the same tests but in native mode.
}