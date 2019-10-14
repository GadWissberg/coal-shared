package utils;

public final class SharedC {


    public static final class Par {
        public static final class MainHeader {
            public static final byte[] TYPE_MPAR = {'m', 'p', 'a', 'r'};
            private static final byte[] TYPE_APAR = {'a', 'p', 'a', 'r'};
            public static final short VERSION_VALUE = 0;
            public static final short VERSION_SIZE = 2;
        }

        public static final class Sections {

            public static final int SECTION_SIZE = 2;

            public static final class Assets {
                public static final int ASSET_ID_SIZE = 6;
                public static final int ASSET_DATA_SIZE = 4;
            }

            public static final int ID_SIZE = 3;

            public enum SectionType {
                IMG, TXT, MAP
            }

        }

    }

    public static final float WORLD_UNIT = 64;

}
