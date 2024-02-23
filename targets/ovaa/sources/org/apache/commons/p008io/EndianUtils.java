package org.apache.commons.p008io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.UByte;
/* renamed from: org.apache.commons.io.EndianUtils */
/* loaded from: classes.dex */
public class EndianUtils {
    public static short swapShort(short value) {
        return (short) ((((value >> 0) & 255) << 8) + (((value >> 8) & 255) << 0));
    }

    public static int swapInteger(int value) {
        return (((value >> 0) & 255) << 24) + (((value >> 8) & 255) << 16) + (((value >> 16) & 255) << 8) + (((value >> 24) & 255) << 0);
    }

    public static long swapLong(long value) {
        return (((value >> 0) & 255) << 56) + (((value >> 8) & 255) << 48) + (((value >> 16) & 255) << 40) + (((value >> 24) & 255) << 32) + (((value >> 32) & 255) << 24) + (((value >> 40) & 255) << 16) + (((value >> 48) & 255) << 8) + ((255 & (value >> 56)) << 0);
    }

    public static float swapFloat(float value) {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(value)));
    }

    public static double swapDouble(double value) {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(value)));
    }

    public static void writeSwappedShort(byte[] data, int offset, short value) {
        data[offset + 0] = (byte) ((value >> 0) & 255);
        data[offset + 1] = (byte) ((value >> 8) & 255);
    }

    public static short readSwappedShort(byte[] data, int offset) {
        return (short) (((data[offset + 0] & UByte.MAX_VALUE) << 0) + ((data[offset + 1] & UByte.MAX_VALUE) << 8));
    }

    public static int readSwappedUnsignedShort(byte[] data, int offset) {
        return ((data[offset + 0] & UByte.MAX_VALUE) << 0) + ((data[offset + 1] & UByte.MAX_VALUE) << 8);
    }

    public static void writeSwappedInteger(byte[] data, int offset, int value) {
        data[offset + 0] = (byte) ((value >> 0) & 255);
        data[offset + 1] = (byte) ((value >> 8) & 255);
        data[offset + 2] = (byte) ((value >> 16) & 255);
        data[offset + 3] = (byte) ((value >> 24) & 255);
    }

    public static int readSwappedInteger(byte[] data, int offset) {
        return ((data[offset + 0] & UByte.MAX_VALUE) << 0) + ((data[offset + 1] & UByte.MAX_VALUE) << 8) + ((data[offset + 2] & UByte.MAX_VALUE) << 16) + ((data[offset + 3] & UByte.MAX_VALUE) << 24);
    }

    public static long readSwappedUnsignedInteger(byte[] data, int offset) {
        long low = ((data[offset + 0] & UByte.MAX_VALUE) << 0) + ((data[offset + 1] & UByte.MAX_VALUE) << 8) + ((data[offset + 2] & UByte.MAX_VALUE) << 16);
        long high = data[offset + 3] & UByte.MAX_VALUE;
        return (high << 24) + (4294967295L & low);
    }

    public static void writeSwappedLong(byte[] data, int offset, long value) {
        data[offset + 0] = (byte) ((value >> 0) & 255);
        data[offset + 1] = (byte) ((value >> 8) & 255);
        data[offset + 2] = (byte) ((value >> 16) & 255);
        data[offset + 3] = (byte) ((value >> 24) & 255);
        data[offset + 4] = (byte) ((value >> 32) & 255);
        data[offset + 5] = (byte) ((value >> 40) & 255);
        data[offset + 6] = (byte) ((value >> 48) & 255);
        data[offset + 7] = (byte) ((value >> 56) & 255);
    }

    public static long readSwappedLong(byte[] data, int offset) {
        long low = readSwappedInteger(data, offset);
        long high = readSwappedInteger(data, offset + 4);
        return (high << 32) + (4294967295L & low);
    }

    public static void writeSwappedFloat(byte[] data, int offset, float value) {
        writeSwappedInteger(data, offset, Float.floatToIntBits(value));
    }

    public static float readSwappedFloat(byte[] data, int offset) {
        return Float.intBitsToFloat(readSwappedInteger(data, offset));
    }

    public static void writeSwappedDouble(byte[] data, int offset, double value) {
        writeSwappedLong(data, offset, Double.doubleToLongBits(value));
    }

    public static double readSwappedDouble(byte[] data, int offset) {
        return Double.longBitsToDouble(readSwappedLong(data, offset));
    }

    public static void writeSwappedShort(OutputStream output, short value) throws IOException {
        output.write((byte) ((value >> 0) & 255));
        output.write((byte) ((value >> 8) & 255));
    }

    public static short readSwappedShort(InputStream input) throws IOException {
        return (short) (((read(input) & 255) << 0) + ((read(input) & 255) << 8));
    }

    public static int readSwappedUnsignedShort(InputStream input) throws IOException {
        int value1 = read(input);
        int value2 = read(input);
        return ((value1 & 255) << 0) + ((value2 & 255) << 8);
    }

    public static void writeSwappedInteger(OutputStream output, int value) throws IOException {
        output.write((byte) ((value >> 0) & 255));
        output.write((byte) ((value >> 8) & 255));
        output.write((byte) ((value >> 16) & 255));
        output.write((byte) ((value >> 24) & 255));
    }

    public static int readSwappedInteger(InputStream input) throws IOException {
        int value1 = read(input);
        int value2 = read(input);
        int value3 = read(input);
        int value4 = read(input);
        return ((value1 & 255) << 0) + ((value2 & 255) << 8) + ((value3 & 255) << 16) + ((value4 & 255) << 24);
    }

    public static long readSwappedUnsignedInteger(InputStream input) throws IOException {
        int value1 = read(input);
        int value2 = read(input);
        int value3 = read(input);
        int value4 = read(input);
        long low = ((value1 & 255) << 0) + ((value2 & 255) << 8) + ((value3 & 255) << 16);
        long high = value4 & 255;
        return (high << 24) + (4294967295L & low);
    }

    public static void writeSwappedLong(OutputStream output, long value) throws IOException {
        output.write((byte) ((value >> 0) & 255));
        output.write((byte) ((value >> 8) & 255));
        output.write((byte) ((value >> 16) & 255));
        output.write((byte) ((value >> 24) & 255));
        output.write((byte) ((value >> 32) & 255));
        output.write((byte) ((value >> 40) & 255));
        output.write((byte) ((value >> 48) & 255));
        output.write((byte) ((value >> 56) & 255));
    }

    public static long readSwappedLong(InputStream input) throws IOException {
        byte[] bytes = new byte[8];
        for (int i = 0; i < 8; i++) {
            bytes[i] = (byte) read(input);
        }
        return readSwappedLong(bytes, 0);
    }

    public static void writeSwappedFloat(OutputStream output, float value) throws IOException {
        writeSwappedInteger(output, Float.floatToIntBits(value));
    }

    public static float readSwappedFloat(InputStream input) throws IOException {
        return Float.intBitsToFloat(readSwappedInteger(input));
    }

    public static void writeSwappedDouble(OutputStream output, double value) throws IOException {
        writeSwappedLong(output, Double.doubleToLongBits(value));
    }

    public static double readSwappedDouble(InputStream input) throws IOException {
        return Double.longBitsToDouble(readSwappedLong(input));
    }

    private static int read(InputStream input) throws IOException {
        int value = input.read();
        if (-1 == value) {
            throw new EOFException("Unexpected EOF reached");
        }
        return value;
    }
}
