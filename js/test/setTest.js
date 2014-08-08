QUnit.test( "empty set", function( assert ) {
    var s = new Set();
    assert.ok(s.isEmpty(), "new set is empty" );
});

QUnit.test( "empty set returns false when initialised with contents", function( assert ) {
    var s = new Set(1, 3, 4);
    assert.ok(!s.isEmpty(), "new set with contents is not empty" );
});

QUnit.test( "test for membership", function( assert ) {
    var s = new Set(1, 3, 4);
    assert.ok(s.contains(3));
    assert.ok(!s.contains(7));
});
