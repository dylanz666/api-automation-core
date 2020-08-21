package com.github.dylanz666.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.dylanz666.domain.AllureAttachment;
import com.github.dylanz666.service.AllureAttachmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class AssertUtil {
    @Autowired
    private AllureAttachment allureAttachment;
    @Autowired
    private AllureAttachmentServiceImpl allureAttachmentService;

    public void assertTrue(boolean condition, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertTrue(" + condition + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertTrue(condition, message);
    }

    public void assertTrue(boolean condition) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertTrue(" + condition + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        assertTrue(condition, null);
    }

    public void assertFalse(boolean condition, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertFalse(" + condition + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertFalse(condition, message);
    }

    public void assertFalse(boolean condition) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertFalse(" + condition + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        assertFalse(condition, null);
    }

    public void fail(String message, Throwable realCause) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.fail(" + message + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.fail(message, realCause);
    }

    public void fail(String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.fail(" + message + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.fail(message);
    }

    public void fail() {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.fail()");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.fail();
    }

    public void assertEquals(Object actual, Object expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(byte[] actual, byte[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(byte[] actual, byte[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(short[] actual, short[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(short[] actual, short[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(int[] actual, int[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(int[] actual, int[] expected, String message) {
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(boolean[] actual, boolean[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(boolean[] actual, boolean[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(char[] actual, char[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(char[] actual, char[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(float[] actual, float[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(float[] actual, float[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(float[] actual, float[] expected, float delta) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta);
    }

    public void assertEquals(float[] actual, float[] expected, float delta, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta, message);
    }

    public void assertEquals(double[] actual, double[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(double[] actual, double[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(double[] actual, double[] expected, double delta) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta);
    }

    public void assertEquals(double[] actual, double[] expected, double delta, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta, message);
    }

    public void assertEquals(long[] actual, long[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(long[] actual, long[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(Object actual, Object expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(String actual, String expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(String actual, String expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(double actual, double expected, double delta, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta, message);
    }

    public void assertEquals(double actual, double expected, double delta) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta);
    }

    public void assertEquals(double actual, double expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(double actual, double expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(float actual, float expected, float delta, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta, message);
    }

    public void assertEquals(float actual, float expected, float delta) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, delta);
    }

    public void assertEquals(float actual, float expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(float actual, float expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(long actual, long expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(long actual, long expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(boolean actual, boolean expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(boolean actual, boolean expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(byte actual, byte expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(byte actual, byte expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(char actual, char expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(char actual, char expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(short actual, short expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(short actual, short expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(int actual, int expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(int actual, int expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertNotNull(Object object) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotNull(" + object + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotNull(object);
    }

    public void assertNotNull(Object object, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotNull(" + object + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotNull(object, message);
    }

    public void assertNull(Object object) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNull(" + object + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNull(object);
    }

    public void assertNull(Object object, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNull(" + object + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNull(object, message);
    }

    public void assertSame(Object actual, Object expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertSame(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertSame(actual, expected, message);
    }

    public void assertSame(Object actual, Object expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertSame(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertSame(actual, expected);
    }

    public void assertNotSame(Object actual, Object expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotSame(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotSame(actual, expected, message);
    }

    public void assertNotSame(Object actual, Object expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotSame(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotSame(actual, expected);
    }

    public void assertEquals(Collection<?> actual, Collection<?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(Collection<?> actual, Collection<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(Iterator<?> actual, Iterator<?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(Iterator<?> actual, Iterator<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(Iterable<?> actual, Iterable<?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(Iterable<?> actual, Iterable<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEquals(Object[] actual, Object[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEqualsNoOrder(Object[] actual, Object[] expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEqualsNoOrder(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEqualsNoOrder(actual, expected, message);
    }

    public void assertEquals(Object[] actual, Object[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEqualsNoOrder(Object[] actual, Object[] expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEqualsNoOrder(" + Arrays.toString(actual) + "," + Arrays.toString(expected) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEqualsNoOrder(actual, expected);
    }

    public void assertEquals(Set<?> actual, Set<?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(Set<?> actual, Set<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEqualsDeep(Set<?> actual, Set<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEqualsDeep(actual, expected, message);
    }

    public void assertEquals(Map<?, ?> actual, Map<?, ?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected);
    }

    public void assertEquals(Map<?, ?> actual, Map<?, ?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual, expected, message);
    }

    public void assertEqualsDeep(Map<?, ?> actual, Map<?, ?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEqualsDeep(actual, expected);
    }

    public void assertEqualsDeep(Map<?, ?> actual, Map<?, ?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEqualsDeep(actual, expected, message);
    }

    public void assertNotEquals(Object actual1, Object actual2, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual1 + "," + actual2 + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual1, actual2, message);
    }

    public void assertNotEquals(Object actual1, Object actual2) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual1 + "," + actual2 + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual1, actual2);
    }

    public void assertNotEquals(float actual1, float actual2, float delta, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual1 + "," + actual2 + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual1, actual2, delta, message);
    }

    public void assertNotEquals(float actual1, float actual2, float delta) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual1 + "," + actual2 + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual1, actual2, delta);
    }

    public void assertNotEquals(double actual1, double actual2, double delta, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual1 + "," + actual2 + "," + delta + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual1, actual2, delta, message);
    }

    public void assertNotEquals(Set<?> actual, Set<?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual, expected);
    }

    public void assertNotEquals(Set<?> actual, Set<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual, expected, message);
    }

    public void assertNotEqualsDeep(Set<?> actual, Set<?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEqualsDeep(actual, expected);
    }

    public void assertNotEqualsDeep(Set<?> actual, Set<?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEqualsDeep(actual, expected, message);
    }

    public void assertNotEquals(Map<?, ?> actual, Map<?, ?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual, expected);
    }

    public void assertNotEquals(Map<?, ?> actual, Map<?, ?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual, expected, message);
    }

    public void assertNotEqualsDeep(Map<?, ?> actual, Map<?, ?> expected) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEqualsDeep(actual, expected);
    }

    public void assertNotEqualsDeep(Map<?, ?> actual, Map<?, ?> expected, String message) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEqualsDeep(" + actual + "," + expected + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEqualsDeep(actual, expected, message);
    }

    public void assertNotEquals(double actual1, double actual2, double delta) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.assertNotEquals(" + actual1 + "," + actual2 + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertNotEquals(actual1, actual2, delta);
    }

    public void containsKey(JSONObject jsonObject, String key) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsKey(" + jsonObject + "," + key + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        assertThat(jsonObject).containsKey(key);
    }

    public void containsKey(String jsonString, String key) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsKey(" + jsonString + "," + key + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        assertThat(jsonObject).containsKey(key);
    }

    public void containsKeys(String jsonString, String... keys) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsKeys(" + jsonString + "," + String.join(",", keys) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        assertThat(jsonObject).containsKeys();
    }

    public void containsKeys(JSONObject jsonObject, String... keys) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsKeys(" + jsonObject + "," + String.join(",", keys) + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        assertThat(jsonObject).containsKeys();
    }

    public void hasAllKeys(JSONObject actual, JSONObject expect) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.hasAllKeys(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        for (Map.Entry<String, Object> entry : expect.entrySet()) {
            assertThat(actual).containsKeys(entry.getKey());
        }
    }

    public void hasAllKeys(String actual, String expect) {
        JSONObject a = JSONObject.parseObject(actual);
        JSONObject e = JSONObject.parseObject(expect);
        hasAllKeys(a, e);
    }

    public void hasSameKeys(JSONObject actual, JSONObject expect) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.hasSameKeys(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        for (Map.Entry<String, Object> entry : expect.entrySet()) {
            assertThat(actual).containsKeys(entry.getKey());
            org.testng.Assert.assertEquals(actual.size(), expect.size());
        }
    }

    public void hasSameKeys(String actual, String expect) {
        JSONObject a = JSONObject.parseObject(actual);
        JSONObject e = JSONObject.parseObject(expect);
        hasSameKeys(a, e);
    }

    public void hasSameItems(JSONArray actual, JSONArray expect) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.hasSameItems(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(actual.size(), expect.size());
        org.testng.Assert.assertTrue(expect.containsAll(actual));
    }

    public void hasSameItems(String actual, String expect) {
        JSONArray a = JSONArray.parseArray(actual);
        JSONArray e = JSONArray.parseArray(expect);
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.hasSameItems(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertEquals(a.size(), e.size());
        org.testng.Assert.assertTrue(a.containsAll(e));
    }

    public void containsItems(JSONArray actual, JSONArray expect) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsItems(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertTrue(actual.size() >= expect.size());
        org.testng.Assert.assertTrue(actual.containsAll(expect));
    }

    public void containsItems(String actual, String expect) {
        JSONArray a = JSONArray.parseArray(actual);
        JSONArray e = JSONArray.parseArray(expect);
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsItems(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        org.testng.Assert.assertTrue(a.size() >= e.size());
        org.testng.Assert.assertTrue(a.containsAll(e));
    }

    public void containsAnyOf(JSONObject actual, JSONObject expect) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsAnyOf(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        for (Map.Entry<String, Object> entry : expect.entrySet()) {
            assertThat(actual).containsAnyOf(entry);
        }
    }

    public void containsAnyOf(String actual, String expect) {
        JSONObject a = JSONObject.parseObject(actual);
        JSONObject e = JSONObject.parseObject(expect);
        containsAnyOf(a, e);
    }

    public void same(JSONObject actual, JSONObject expect) {
        allureAttachment.setName("Assert");
        allureAttachment.setContent("AssertUtil.containsAnyOf(" + actual + "," + expect + ")");
        allureAttachmentService.addAttachment(allureAttachment);
        for (Map.Entry<String, Object> entry : expect.entrySet()) {
            assertThat(actual).containsAnyOf(entry);
            org.testng.Assert.assertEquals(actual.size(), expect.size());
        }
    }

    public void same(String actual, String expect) {
        JSONObject a = JSONObject.parseObject(actual);
        JSONObject e = JSONObject.parseObject(expect);
        same(a, e);
    }
}