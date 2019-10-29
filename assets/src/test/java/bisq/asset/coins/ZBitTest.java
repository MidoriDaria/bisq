/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class ZBitTest extends AbstractAssetTest {

    public ZBitTest() {
        super(new ZBit());
    }

  @Test
  public void testValidAddresses() {
    assertValidAddress("8Hu897ivzmeFuLNB6956X6gyGeVNHUBRgD");
    assertValidAddress("81HwTdCmQV3NspP2QqCGpehoFpi8NY4Zg3");
    assertValidAddress("8Hu897ivzmeFuLNB6956X6gyGfhj676784");
  }

  @Test
  public void testInvalidAddresses() {
    assertInvalidAddress("");
    assertInvalidAddress("8");
    assertInvalidAddress("822FRU9f3fx7Hty641D5cg95kRK6sH0rT");
    assertInvalidAddress("822FRU9f3fx7Hty641D5cg95kRK6S3sbfISTOOLONG");
    
    assertInvalidAddress("MHu897ivzmeFuLNB6956X6gyGfhj676784");
    assertInvalidAddress("M");
    assertInvalidAddress("M22FRU9f3fx7Hty641D5cg95kRK6sH0rT");
    assertInvalidAddress("M22FRU9f3fx7Hty641D5cg95kRK6S3sbfISTOOLONG");
  }
}
