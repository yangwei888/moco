package com.github.dreamhead.moco;

public class UnexpectedRequestMatcher implements RequestMatcher {
    @Override
    public boolean match(final Request request) {
        return true;
    }

    @Override
    public RequestMatcher apply(final MocoConfig config) {
        return this;
    }
}
