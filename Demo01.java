// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo01.java

import java.io.PrintStream;

public class Demo01
{

	public Demo01()
	{
	}

	public static void main(String args[])
	{
		byte byte0 = 10;
		byte byte1 = 20;
		int i = byte0 + byte1;
		System.out.println(i);
		byte byte2 = 10;
		byte byte3 = 20;
		byte byte4 = byte2 <= byte3 ? byte3 : byte2;
		System.out.println(byte4);
	}
}
