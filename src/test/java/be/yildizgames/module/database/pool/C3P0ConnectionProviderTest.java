/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 *
 */

package be.yildizgames.module.database.pool;

import be.yildizgames.module.database.DataBaseConnectionProvider;
import be.yildizgames.module.database.DbProperties;
import org.h2.Driver;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Grégory Van den Borre
 */
public class C3P0ConnectionProviderTest {

    @Nested
    class Constructor {

     /*   @Test
        void happyFlow() throws Exception {
            DbProperties properties = new DummyDatabaseConnectionProvider.DefaultProperties();
            try(DataBaseConnectionProvider p = new C3P0ConnectionProvider(new DummySystem(Driver::new), properties)) {
            }
        }

        @Test
        void withNullSystem() {
            DbProperties properties = new DummyDatabaseConnectionProvider.DefaultProperties();
            assertThrows(NullPointerException.class, () -> new C3P0ConnectionProvider(null, properties));
        }

        @Test
        void withNullProperties() {
            assertThrows(NullPointerException.class, () -> new C3P0ConnectionProvider(new DummySystem(Driver::new), null));
        }*/
    }

    @Nested
    class GetConnection {

      /*  @Test
        void happyFlow() throws Exception {
            DbProperties properties = new DummyDatabaseConnectionProvider.DefaultProperties();
            try(DataBaseConnectionProvider p = new C3P0ConnectionProvider(new DummySystem(Driver::new), properties)) {
                assertNotNull(p.getConnection());
            }
        }*/
    }

    @Nested
    class Close {

    /*    @Test
        void happyFlow() throws Exception {
            DbProperties properties = new DummyDatabaseConnectionProvider.DefaultProperties();
            DataBaseConnectionProvider p = new C3P0ConnectionProvider(new DummySystem(Driver::new), properties);
            p.getConnection();
            p.close();
        }*/
    }
}
