
package Example_18;

// Import BufferedOutputStream class.
// Class metadata -> Method Area
import java.io.BufferedOutputStream;

// Import FileInputStream class.
// Class metadata -> Method Area
import java.io.FileInputStream;

// Import FileOutputStream class.
// Class metadata -> Method Area
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        try {

            // Reference variable -> Stack
            // FileOutputStream object -> Heap
            FileOutputStream w = new FileOutputStream(
                    "/home/baraa/Projects/java-practice/Example_18/text", true);

            // Reference variable -> Stack
            // BufferedOutputStream object -> Heap
            // Uses FileOutputStream object internally.
            BufferedOutputStream buf = new BufferedOutputStream(
                    new FileOutputStream(
                            "/home/baraa/Projects/java-practice/Example_18/text"));

            // Primitive variable -> Stack
            for (int i = 0; i < 8193; i++) {

                // Writes one byte into the buffer.
                buf.write(i);
            }

            // Forces buffered data to be written to the file.
            buf.flush();

            // Releases the stream resources.
            buf.close();

            // Reference variable -> Stack
            // FileInputStream object -> Heap
            FileInputStream r = new FileInputStream(
                    "/home/baraa/Projects/java-practice/Example_18/text");

            // Prints a message.
            System.out.println("Starting");

            // Close the input stream.
            r.close();

            // Close the output stream.
            w.close();

        } catch (Exception e) {

            // e reference -> Stack
            // Exception object -> Heap
            e.printStackTrace();

        } finally {

            // Executes whether an exception occurs or not.
            System.out.println("bye");
        }

        // Executes after try-catch-finally.
        System.out.println("the end");
    }
}

/*
 * =========================================
 * Memory Summary
 * =========================================
 * 
 * Stack
 * -----
 * - w
 * - buf
 * - r
 * - i
 * - e
 * 
 * Heap
 * ----
 * - FileOutputStream object
 * - BufferedOutputStream object
 * - Internal byte buffer
 * - FileInputStream object
 * - Exception object (if thrown)
 * 
 * Rule
 * ----
 * FileOutputStream
 * -> Writes bytes directly to a file.
 * 
 * BufferedOutputStream
 * -> Stores bytes temporarily in an internal buffer (Heap).
 * -> Writes them to the file when:
 * - flush() is called.
 * - close() is called.
 * - the buffer becomes full.
 * 
 * flush()
 * -------
 * Copies buffered data to the file
 * without closing the stream.
 * 
 * close()
 * -------
 * Flushes remaining data first,
 * then closes the stream and releases resources.
 */
