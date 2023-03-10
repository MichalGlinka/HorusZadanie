package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream().filter(x -> x.getColor().equals(color)).findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(x -> x.getMaterial().equals(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
