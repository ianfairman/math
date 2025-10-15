/*
 * Copyright 2025 Ian Fairman <ian.fairman@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.ianfairman.math;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ian Fairman <ian.fairman@gmail.com>
 */
public class TwoWayTableTest {
    
    @Test
    void shouldAcceptRectangularArray() {
        // Given
        double[][] array = {{2D, 3D, 4D}, {5D, 6D, 7D}};
        
        // When
        try {
            var _ = new TwoWayTable(array);
        } catch (IllegalArgumentException _) {
            // Then
            fail();
        }
    }
    
    @Test
    void shouldNotExceptNull() {
        try {
            // When
            var _ = new TwoWayTable(null);
        } catch (NullPointerException _) {
            return;
        }
        // Then
        fail();
    }
    
    @Test
    void shouldNotAccepNontRectangularArray() {
        // Given
        double[][] array = {{2D, 3D, 4D}, {5D, 6D}};
        
        // When
        try {
            var _ = new TwoWayTable(array);
        } catch (IllegalArgumentException _) {
            return;
        }
        // Then
        fail();
    }
    
    @Test
    void shouldCalculateLengthForRow1() {
        // Given
        double[][] array = {{2D, 3D, 4D}, {5D, 6D, 7D}};
        var table = new TwoWayTable(array);
        
        // When
        var numberOfRows = table.numberOfRows();
        
        // Then
        assertEquals(2, numberOfRows);
    }
    
    @Test
    void shouldCalculateLengthForRow2() {
        // Given
        double[][] array = {{2D, 3D, 4D}, {5D, 6D, 7D}, {8D, 9D, 10D}};
        var table = new TwoWayTable(array);
        
        // When
        var numberOfRows = table.numberOfRows();
        
        // Then
        assertEquals(3, numberOfRows);
    }
    
        
    @Test
    void shouldCalculateNumberOfColumns1() {
        // Given
        double[][] array = {{2D, 3D, 4D}, {5D, 6D, 7D}};
        var table = new TwoWayTable(array);
        
        // When
        var numberOfColumns = table.numberOfColumns();
        
        // Then
        assertEquals(3, numberOfColumns);
    }
        
    @Test
    void shouldCalculateNumberOfColumns2() {
        // Given
        double[][] array = {{2D, 3D, 4D, 5D}, {5D, 6D, 7D, 8D}};
        var table = new TwoWayTable(array);
        
        // When
        var numberOfColumns = table.numberOfColumns();
        
        // Then
        assertEquals(4, numberOfColumns);
    }
    
    @Test
    void shouldExtractRow1() {
        // Given
        double[][] array = {{2D, 3D, 4D, 5D}, {5D, 6D, 7D, 8D}};
        var table = new TwoWayTable(array);
        
        // When
        double[] row = table.row(1);
        
        // Then
        assertArrayEquals(new double[] {5D, 6D, 7D, 8D}, row);
    }
    
    @Test
    void shouldExtractRow0() {
        // Given
        double[][] array = {{2D, 3D, 4D, 5D}, {5D, 6D, 7D, 8D}};
        var table = new TwoWayTable(array);
        
        // When
        double[] row = table.row(0);
        
        // Then
        assertArrayEquals(new double[] {2D, 3D, 4D, 5D}, row);
    }
    
    @Test
    void shouldExtractColumn1() {
        // Given
        double[][] array = {{2D, 3D, 4D, 5D}, {5D, 6D, 7D, 8D}};
        var table = new TwoWayTable(array);
        
        // When
        double[] column = table.column(1);
        
        // Then
        assertArrayEquals(new double[] {3D, 6D}, column);
    }
    
    @Test
    void shouldExtractColumn3() {
        // Given
        double[][] array = {{2D, 3D, 4D, 5D}, {5D, 6D, 7D, 8D}};
        var table = new TwoWayTable(array);
        
        // When
        double[] column = table.column(3);
        
        // Then
        assertArrayEquals(new double[] {5D, 8D}, column);
    }
}
