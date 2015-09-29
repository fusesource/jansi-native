/**
 * Copyright (C) 2009, Progress Software Corporation and/or its 
 * subsidiaries or affiliates.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.jansi.internal;

import static org.fusesource.hawtjni.runtime.FieldFlag.CONSTANT;
import static org.fusesource.hawtjni.runtime.MethodFlag.CONSTANT_INITIALIZER;

import static org.fusesource.hawtjni.runtime.ArgFlag.*;

import org.fusesource.hawtjni.runtime.ArgFlag;
import org.fusesource.hawtjni.runtime.ClassFlag;
import org.fusesource.hawtjni.runtime.JniArg;
import org.fusesource.hawtjni.runtime.JniClass;
import org.fusesource.hawtjni.runtime.JniField;
import org.fusesource.hawtjni.runtime.JniMethod;
import org.fusesource.hawtjni.runtime.Library;

/**
 * Interface to access some low level POSIX functions.
 * 
 * @author <a href="http://hiramchirino.com">Hiram Chirino</a>
 */
@JniClass()
public class CLibrary {
    
    private static final Library LIBRARY = new Library("jansi", CLibrary.class);    
    static {
        LIBRARY.load();
        init();
    }

    @JniMethod(flags={CONSTANT_INITIALIZER})
    private static native void init();

    @JniField(flags={CONSTANT}, conditional="defined(STDIN_FILENO)")
    public static int STDIN_FILENO;
    @JniField(flags={CONSTANT}, conditional="defined(STDOUT_FILENO)")
    public static int STDOUT_FILENO;
    @JniField(flags={CONSTANT}, conditional="defined(STDERR_FILENO)")
    public static int STDERR_FILENO;

    @JniField(flags={CONSTANT}, accessor="1", conditional="defined(HAVE_ISATTY)")
    public static boolean HAVE_ISATTY;
    @JniMethod(conditional="defined(HAVE_ISATTY)")
    public static native int isatty(
            @JniArg int fd);

    @JniMethod(conditional="defined(HAVE_TTYNAME)")
    public static native String ttyname(
            @JniArg int filedes);

    @JniMethod(conditional="defined(HAVE_TTYSLOT)")
    public static native int ttyslot();

    @JniMethod(conditional="defined(HAVE_OPENPTY)")
    public static native int openpty(
            @JniArg(cast="int *", flags={NO_IN}) int[] amaster,
            @JniArg(cast="int *", flags={NO_IN}) int[] aslave,
            @JniArg(cast="char *", flags={NO_IN}) byte[] name,
            @JniArg(cast="struct termios *", flags={NO_OUT}) Termios termios,
            @JniArg(cast="struct winsize *", flags={NO_OUT}) WinSize winsize);

    @JniMethod(conditional="defined(HAVE_TCGETATTR)")
    public static native int tcgetattr(
            @JniArg int filedes,
            @JniArg(cast="struct termios *", flags={NO_IN}) Termios termios);

    @JniMethod(conditional="defined(HAVE_TCSETATTR)")
    public static native int tcsetattr(
            @JniArg int filedes,
            @JniArg int optional_actions,
            @JniArg(cast="struct termios *", flags={NO_OUT}) Termios termios);

    /*
     * Commands passed to tcsetattr() for setting the termios structure.
     */
    @JniField(flags={CONSTANT}, conditional="defined(TCSANOW)")
    public static int TCSANOW;		    /* make change immediate */
    @JniField(flags={CONSTANT}, conditional="defined(TCSADRAIN)")
    public static int TCSADRAIN;		/* drain output, then change */
    @JniField(flags={CONSTANT}, conditional="defined(TCSAFLUSH)")
    public static int TCSAFLUSH;		/* drain output, flush input */

    @JniField(flags={CONSTANT}, conditional="defined(TIOCGETA)")
    public static long TIOCGETA;
    @JniField(flags={CONSTANT}, conditional="defined(TIOCSETA)")
    public static long TIOCSETA;
    @JniField(flags={CONSTANT}, conditional="defined(TIOCGETD)")
    public static long TIOCGETD;
    @JniField(flags={CONSTANT}, conditional="defined(TIOCSETD)")
    public static long TIOCSETD;
    @JniField(flags={CONSTANT}, conditional="defined(TIOCGWINSZ)")
    public static long TIOCGWINSZ;
    @JniField(flags={CONSTANT}, conditional="defined(TIOCSWINSZ)")
    public static long TIOCSWINSZ;

    @JniMethod(conditional="defined(HAVE_IOCTL)")
    public static native int ioctl(
            @JniArg int filedes,
            @JniArg long request,
            @JniArg int[] params);

    @JniMethod(conditional="defined(HAVE_IOCTL) && defined(HAVE_OPENPTY)")
    public static native int ioctl(
            @JniArg int filedes,
            @JniArg long request,
            @JniArg(flags = ArgFlag.POINTER_ARG) WinSize params);

    @JniClass(flags={ClassFlag.STRUCT}, name="winsize", conditional="defined(HAVE_OPENPTY)")
    public static class WinSize {

        static {
            LIBRARY.load();
            init();
        }

        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(struct winsize)")
        public static int SIZEOF;

        @JniField(accessor="ws_row")
        public short ws_row;
        @JniField(accessor="ws_col")
        public short ws_col;
        @JniField(accessor="ws_xpixel")
        public short ws_xpixel;
        @JniField(accessor="ws_ypixel")
        public short ws_ypixel;

        public WinSize() {
        }

        public WinSize(short ws_row, short ws_col) {
            this.ws_row = ws_row;
            this.ws_col = ws_col;
        }
    }

    @JniClass(flags={ClassFlag.STRUCT}, name="termios", conditional="defined(HAVE_OPENPTY)")
    public static class Termios {

        static {
            LIBRARY.load();
            init();
        }

        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(struct termios)")
        public static int SIZEOF;

        @JniField(accessor="c_iflag")
        public long c_iflag;
        @JniField(accessor="c_oflag")
        public long c_oflag;
        @JniField(accessor="c_cflag")
        public long c_cflag;
        @JniField(accessor="c_lflag")
        public long c_lflag;
        @JniField(accessor="c_cc")
        public byte[] c_cc = new byte[20];
        @JniField(accessor="c_ispeed")
        public long c_ispeed;
        @JniField(accessor="c_ospeed")
        public long c_ospeed;
    }

    /**
     * Control characters
     */
    public static final int VEOF =      0;
    public static final int VEOL =      1;
    public static final int VEOL2 =     2;
    public static final int VERASE =    3;
    public static final int VWERASE =   4;
    public static final int VKILL =     5;
    public static final int VREPRINT =  6;
    public static final int VINTR =     8;
    public static final int VQUIT =     9;
    public static final int VSUSP =    10;
    public static final int VDSUSP =   11;
    public static final int VSTART =   12;
    public static final int VSTOP =    13;
    public static final int VLNEXT =   14;
    public static final int VDISCARD = 15;
    public static final int VMIN =     16;
    public static final int VTIME =    17;
    public static final int VSTATUS =  18;

    /**
     * Input flags - software input processing
     */
    public static final int IGNBRK =         0x00000001;      /* ignore BREAK condition */
    public static final int BRKINT =         0x00000002;      /* map BREAK to SIGINTR */
    public static final int IGNPAR =         0x00000004;      /* ignore (discard) parity errors */
    public static final int PARMRK =         0x00000008;      /* mark parity and framing errors */
    public static final int INPCK =          0x00000010;      /* enable checking of parity errors */
    public static final int ISTRIP =         0x00000020;      /* strip 8th bit off chars */
    public static final int INLCR =          0x00000040;      /* map NL into CR */
    public static final int IGNCR =          0x00000080;      /* ignore CR */
    public static final int ICRNL =          0x00000100;      /* map CR to NL (ala CRMOD) */
    public static final int IXON =           0x00000200;      /* enable output flow control */
    public static final int IXOFF =          0x00000400;      /* enable input flow control */
    public static final int IXANY =          0x00000800;      /* any char will restart after stop */

    /*
     * Output flags - software output processing
     */
    public static final int OPOST =          0x00000001;      /* enable following output processing */
    public static final int ONLCR =          0x00000002;      /* map NL to CR-NL (ala CRMOD) */

    /*
     * Control flags - hardware control of terminal
     */
    public static final int CCTS_OFLOW =     0x00010000;      /* CTS flow control of output */
    public static final int CRTS_IFLOW =     0x00020000;      /* RTS flow control of input */
    public static final int CRTSCTS =        (CCTS_OFLOW | CRTS_IFLOW);
    public static final int CDTR_IFLOW =     0x00040000;      /* DTR flow control of input */
    public static final int CDSR_OFLOW =     0x00080000;      /* DSR flow control of output */
    public static final int CCAR_OFLOW =     0x00100000;      /* DCD flow control of output */

    /*
     * "Local" flags - dumping ground for other state
     *
     * Warning: some flags in this structure begin with
     * the letter "I" and look like they belong in the
     * input flag.
     */
    public static final int  ECHOE =          0x00000002;      /* visually erase chars */
    public static final int  ECHOK =          0x00000004;      /* echo NL after line kill */
    public static final int  ECHO =           0x00000008;      /* enable echoing */
    public static final int  ECHONL =         0x00000010;      /* echo NL even if ECHO is off */
    public static final int  ISIG =           0x00000080;      /* enable signals INTR, QUIT, [D]SUSP */
    public static final int  ICANON =         0x00000100;      /* canonicalize input lines */
    public static final int  IEXTEN =         0x00000400;      /* enable DISCARD and LNEXT */
    public static final int  TOSTOP =         0x00400000;      /* stop background jobs from output */
    public static final int  NOFLSH =         0x80000000;      /* don't flush after interrupt */


}
