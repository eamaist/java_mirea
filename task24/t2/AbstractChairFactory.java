package task24.t2;

import extra.UniPracPack24_2.MagicChairFactory;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
